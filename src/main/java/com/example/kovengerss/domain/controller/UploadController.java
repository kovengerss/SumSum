package com.example.kovengerss.domain.controller;

import com.example.kovengerss.domain.vo.AttachFileVO;
import lombok.extern.slf4j.Slf4j;
import net.coobird.thumbnailator.Thumbnailator;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@Slf4j
@RequestMapping("/upload/*")
public class UploadController {
    //    ajax를 사용한 파일 업로드
    @GetMapping("/uploadAjax")
    public void uploadAjax(){
        log.info("upload ajax");
    }

    @ResponseBody //REST
    @PostMapping("/uploadAjax")
    public List<AttachFileVO> uploadAjax(MultipartFile[] files) throws IOException {
        List<AttachFileVO> fileList = new ArrayList<>();
        String rootDirectory = "D:\\web_1900_kgw\\spring\\workspace\\kovengerss\\src\\main\\resources\\static\\";

        File uploadDirectory = new File(rootDirectory, getDateDirectory());
        if(!uploadDirectory.exists()) {uploadDirectory.mkdirs();}

        for (MultipartFile file : files){
            log.info("------------------------------------");
            log.info("upload file name : " + file.getOriginalFilename());
            log.info("upload file size : " + file.getSize());
            AttachFileVO attachFileVO = new AttachFileVO();

            UUID uuid = UUID.randomUUID();
            String fileName = uuid.toString() + "_" + file.getOriginalFilename();

            attachFileVO.setOriginalFileName(file.getOriginalFilename());
            attachFileVO.setFileName(fileName);
            attachFileVO.setUploadDirectory(getDateDirectory());

            File saveFile = new File(uploadDirectory, fileName);
            file.transferTo(saveFile);

            if(checkImageType(saveFile)){
                FileOutputStream thumbnail = new FileOutputStream(new File(uploadDirectory, "t_" + fileName));
                Thumbnailator.createThumbnail(file.getInputStream(), thumbnail, 400, 400);
                thumbnail.close();
                attachFileVO.setImage(true);
            }
            fileList.add(attachFileVO);
        }
        return fileList;
    }

    @GetMapping("display")
    @ResponseBody
    public byte[] getFile(String path) throws IOException {
        return FileCopyUtils.copyToByteArray(new File("D:\\web_1900_kgw\\spring\\workspace\\kovengerss\\src\\main\\resources\\static\\" + path));
    }

    @GetMapping("/download")
    @ResponseBody
    public ResponseEntity<Resource> download(String path) throws UnsupportedEncodingException {
        Resource resource = new FileSystemResource("D:\\web_1900_kgw\\spring\\workspace\\kovengerss\\src\\main\\resources\\static\\" + path);
        String name = resource.getFilename();
        name = name.substring(name.indexOf("_") + 1);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment; filename=" + new String(name.getBytes("UTF-8"), "ISO-8859-1"));
        return new ResponseEntity<Resource>(resource, headers, HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public void deleteFile(String path){
//        썸네일 삭제
        File file = new File("D:\\web_1900_kgw\\spring\\workspace\\kovengerss\\src\\main\\resources\\static\\", path);
        if(file.exists()) {file.delete();}

//        원본파일 삭제
        file = new File(file.getPath().replace("t_", ""));
        if(file.exists()) {file.delete();}
    }

    private String getDateDirectory(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        String directory = sdf.format(date);
        return directory;
    }

    private boolean checkImageType(File file) throws IOException{
        return Files.probeContentType(file.toPath()).startsWith("image");
    }
}
