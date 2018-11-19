package cn.laeni.project1.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.laeni.project1.entity.Forum;
import cn.laeni.project1.mapper.ForumMapper;
import cn.laeni.project1.service.IndexService;
@Service
public class IndexServiceImpl implements IndexService {
	@Autowired
	ForumMapper fm;
	public List<Forum> showIndexForum() {
		return fm.selectForumLast3();
	}
	public List<Forum> showIndexSomeForum(String typeId) {
		return fm.selectForumByTypeId(typeId);
	}

}
