package com.blackwater.novel.novelmain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 语录合集
 * @TableName saying
 * @author by MechellWater
 * @date : 2022-07-18 14:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Saying implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     * 提问内容
     */
    private String question;

    /**
     * 回复内容
     */
    private String body;

    /**
     * 类型
     */
    private String type;

    /**
     * 出自谁?
     */
    private String author;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Saying other = (Saying) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getQuestion() == null ? other.getQuestion() == null : this.getQuestion().equals(other.getQuestion()))
                && (this.getBody() == null ? other.getBody() == null : this.getBody().equals(other.getBody()))
                && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
                && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getQuestion() == null) ? 0 : getQuestion().hashCode());
        result = prime * result + ((getBody() == null) ? 0 : getBody().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", question=").append(question);
        sb.append(", body=").append(body);
        sb.append(", type=").append(type);
        sb.append(", author=").append(author);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}