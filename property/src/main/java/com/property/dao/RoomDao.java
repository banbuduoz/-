package com.property.dao;

import java.util.List;

import com.property.bean.Room;

/**
 * @author zyl
 * @category 房屋数据访问接口
 */
public interface RoomDao {
	/**
	 * @param room
	 * @return
	 * @category 添加房屋
	 */
	public int add(Room room);

	/**
	 * @param id
	 * @return
	 * @category 删除房屋
	 */
	public int delete(int id);

	/**
	 * @param id
	 * @return
	 * @category 根据单元楼删除房屋
	 */
	public int deleteByHouseId(int hid);

	/**
	 * @param room
	 * @return
	 * @category更新房屋
	 */
	public int update(Room room);

	/**
	 * @param hid
	 * @return
	 * @category 根据单元楼查询房屋
	 */
	public List<Room> selectByHouseId(int hid);

	/**
	 * @param uid
	 * @return
	 * @category 根据用户id查询房屋
	 */
	public Room selectByUserId(int uid);

	/**
	 * @return
	 * @category 查询全部
	 */
	public List<Room> selectAll();

	/**
	 * 同过id查询房屋
	 * 
	 * @param id
	 * @return
	 */
	public Room selectById(int id);

}
