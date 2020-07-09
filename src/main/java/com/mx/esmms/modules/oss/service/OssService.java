package com.mx.esmms.modules.oss.service;

import org.springframework.web.multipart.MultipartFile;

public interface OssService {
    //上传头像到oss
    String uploadFileAvatar(MultipartFile file);

    //上传网络流文件到oss
    String uploadFileAvatar(String url);
}
