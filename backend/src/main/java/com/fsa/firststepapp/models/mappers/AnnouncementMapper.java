package com.fsa.firststepapp.models.mappers;

import com.fsa.firststepapp.models.Announcement;
import com.fsa.firststepapp.models.dto.AnnouncementDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AnnouncementMapper {
    public AnnouncementMapper() {
    }

    public AnnouncementDto convertModelToDto(Announcement announcement) {
        AnnouncementDto announcementDto = new AnnouncementDto();

        announcementDto.setAnnouncementId(announcement.getAnnouncementId());
        announcementDto.setText(announcement.getText());
        announcementDto.setTitle(announcement.getTitle());
        announcementDto.setUrl(announcement.getUrl());
        announcementDto.setUniversity(announcement.getUniversity().getName());
        announcementDto.setFaculty(announcement.getFaculty().getName());

        return announcementDto;
    }

    public List<AnnouncementDto> convertModelListToDtoList(List<Announcement> announcements) {
        List<AnnouncementDto> announcementDtos = new ArrayList<>();

        for(Announcement announcement: announcements) {
            announcementDtos.add(convertModelToDto(announcement));
        }

        return announcementDtos;
    }
}
