package com.macro.mall.tiny.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author: chenyaoyang
 * @date: 2022/8/18 11:08
 * @description: oss上传文件的回调结果
 **/
public class OssCallbackResult {
    @ApiModelProperty("文件名称")
    private String fileName;

    @ApiModelProperty("文件大小")
    private String size;

    @ApiModelProperty("文件的mimeType")
    private String mimeType;

    @ApiModelProperty("图片的宽")
    private String width;

    @ApiModelProperty("图片的高")
    private String height;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
