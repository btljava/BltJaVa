/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlhocsinh.BLO;

import qlhocsinh.DAO.HocSinhDAO;
import qlhocsinh.DTO.HocSinhDTO;

/**
 *
 * @author duong
 */
public class QuanLyHocSinhBLO {
    public int insert(String gioitinh,String malop,String ngaysinh,String quequan,int sodienthoai, String tenhs)
    {
        HocSinhDAO hsDAO= new  HocSinhDAO();
        HocSinhDTO hsDTO= new HocSinhDTO();
        hsDTO.setGioitinh(gioitinh);
        hsDTO.setTenhs(tenhs);
        hsDTO.setNgaysinh(ngaysinh);
        hsDTO.setQuequan(quequan);
        hsDTO.setSodienthoai(sodienthoai);
        hsDTO.setTenhs(tenhs);
        int rs=hsDAO.insert(hsDTO);
        return rs;
        
    }
    
    
}
