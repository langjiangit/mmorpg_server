package com.qworldr.mmorpg.logic.skill.resource;

import com.qworldr.mmorpg.anno.Resource;

import javax.persistence.Id;
import java.util.List;

/**
 * @author wujiazhen
 */
@Resource
public class SkillResource {
    /**
     *  id=skillId+level
     */
    @Id
    private int id;
    private int skillId;
    private int level;
    /**
     *  效果id, 应该类似行为树，技能释放通过树逻辑执行各个效果
     */
    private int effectTreeId;

}
