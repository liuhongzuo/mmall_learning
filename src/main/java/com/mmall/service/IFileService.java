package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by root on 6/14/19.
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
