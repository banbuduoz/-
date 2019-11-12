package com.property.service;

import java.util.List;

import com.property.bean.Room;

public interface RoomService {
	/**
	 * @param room
	 * @return
	 * @category 添加房屋
	 */
	public boolean add(Room room);

	/**
	 * @param id
	 * @return
	 * @category 删除房屋
	 */
	public boolean delete(int id);

	/**
	 * @param id
	 * @return
	 * @category 根据单元楼删除房屋
	 */
	public boolean deleteByHouseId(int hid);

	/**
	 * @param room
	 * @return
	 * @category更新房屋
	 */
	public boolean update(Room room);

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
	 * 同过id查询房屋
	 * 
	 * @param id
	 * @return
	 */
	public Room selectById(int id);
}
