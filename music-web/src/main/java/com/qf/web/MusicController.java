package com.qf.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.pojo.TbMusic;
import com.qf.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("music")
public class MusicController {
    @Autowired
    private MusicService musicService;

    @RequestMapping("findAll")
    private List<TbMusic> findAll(){
        return musicService.findAll();
    }

    @RequestMapping("findById")
    private TbMusic findById(String musicId){
        return musicService.findById(musicId);
    }

    @RequestMapping("search")
    private List<TbMusic> search(String keyword){
        return musicService.search(keyword);
    }

    @RequestMapping("prevSong")
    public TbMusic prevSong(String musicId) {
       return musicService.prevSong(musicId);
    }

    @RequestMapping("nextSong")
    public TbMusic nextSong(String musicId) {

        return musicService.nextSong(musicId);
    }

    @RequestMapping("findPage")
    private PageInfo findPage(@RequestParam(defaultValue = "1") Integer page,
                              @RequestParam(defaultValue = "2") Integer size){
        PageHelper.startPage(page, size);
        List<TbMusic> all = musicService.findAll();
        PageInfo<TbMusic> pageInfo = new PageInfo<TbMusic>(all);
        return pageInfo;
    }
}
