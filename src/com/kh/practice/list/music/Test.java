package com.kh.practice.list.music;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

import java.util.List;

public class Test {

    public static void main(String[] args) {

        MusicController mc = new MusicController();

        mc.ascTitle();
        mc.descSinger();

        List<Music> musicList = mc.printAll();

        for (Music music : musicList) {
            System.out.println(music);
        }
    }
}
