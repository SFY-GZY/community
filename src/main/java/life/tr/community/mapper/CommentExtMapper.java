package life.tr.community.mapper;

import life.tr.community.model.Comment;
import life.tr.community.model.CommentExample;
import life.tr.community.model.Question;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}