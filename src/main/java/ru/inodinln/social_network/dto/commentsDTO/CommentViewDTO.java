package ru.inodinln.social_network.dto.commentsDTO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CommentViewDTO {

    private Long id;

    private Long post;

    private Long author;

    private Long parentComment;

    private LocalDateTime timestamp;

    private LocalDateTime timestampOfUpdating;

    private Integer level;

    private String text;

}
