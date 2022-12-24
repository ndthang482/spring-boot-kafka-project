package com.javaguides;

import com.javaguides.entity.WikimediaData;
import com.javaguides.service.IWikimediaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/wiki")
@RequiredArgsConstructor
public class WikimediaController {
    private final IWikimediaService wikimediaService;

    @GetMapping("")
    public List<WikimediaData> findAll(){
        return wikimediaService.findAll();
    }
}
