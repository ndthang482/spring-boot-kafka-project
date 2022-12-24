package com.javaguides.service;

import com.javaguides.entity.WikimediaData;

import java.util.List;

public interface IWikimediaService {
    List<WikimediaData> findAll();
}
