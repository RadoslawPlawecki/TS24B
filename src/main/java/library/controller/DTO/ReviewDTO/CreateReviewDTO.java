package library.controller.DTO.ReviewDTO;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

public class CreateReviewDTO {
    @NotNull
    @Schema(name = "bookId", example = "2")
    private Integer bookId;
    @NotNull
    @Schema(name = "userId", example = "5")
    private Integer userId;
    @NotNull
    @Schema(name = "rating", example = "10")
    private Integer rating;
    @Schema(name = "comment", example = "Amazing!")
    private String comment;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public CreateReviewDTO() {
    }

    public CreateReviewDTO(Integer bookId, Integer userId, Integer rating, String comment) {
        this.bookId = bookId;
        this.userId = userId;
        this.rating = rating;
        this.comment = comment;
    }
}
