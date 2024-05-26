package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;

/** 课程信息service接口
 * @author mr.Bu
 * @version 1.0.0
 * @date 2024/5/25 23:15
 * @des
 */
public interface CourseBaseService {
      PageResult<CourseBase> queryListBaseCourse(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);
}
