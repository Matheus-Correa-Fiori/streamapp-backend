package com.matheus.streamapp.repository;

import com.matheus.streamapp.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long>{
}
