package com.udacity.jwdnd.course1.cloudstorage.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Files {
    private int fileid;
    private String filename;
    private String contenttype;
    private String filesize;
    private byte[] filedata;

    public byte[] getFiledata() {
        return this.filedata;
    }

    public String getContenttype() {
        return this.contenttype;
    }

    public int getFileid() {
        return this.fileid;
    }

    public String getFilename() {
        return this.filename;
    }

    public void setContenttype(String contentType) {
        this.contenttype = contentType;
    }

    public void setFiledata(byte[] bytes) {
        this.filedata = bytes;
    }

    public void setFilename(String originalFilename) {
        this.filename = originalFilename;
    }

    public void setFilesize(String string) {
        this.filesize = string;
    }
}
