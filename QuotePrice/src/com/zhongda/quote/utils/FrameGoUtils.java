package com.zhongda.quote.utils;

import java.awt.EventQueue;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;

import com.zhongda.quote.model.QuoteProject;
import com.zhongda.quote.view.CreatInspectionFrame;
import com.zhongda.quote.view.CreateContentFrame;
import com.zhongda.quote.view.CreateProjectFrame;
import com.zhongda.quote.view.CreateTaskFrame;
import com.zhongda.quote.view.ModifyContentFrame;

/**
 *
 * <p>
 * 窗口启动类
 * </p>
 *
 * @author 研发中心-LiVerson<1061734892@qq.com>
 * @sine 2017年8月11日
 */
public class FrameGoUtils {

	/**
	 * 创建任务窗口
	 *
	 * @param jt_quoteTask
	 *            任务面板JTable对象
	 */
	public static void creatTask(final JTable jt_quoteTask,
			final boolean isCreate) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateTaskFrame window = new CreateTaskFrame(jt_quoteTask,
							isCreate);
					window.jDialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * 创建新增检验内容窗口
	 * @param jTable
	 */
	public static void createContent(final Integer inspectionid,final JTable jt_inspectionContent){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateContentFrame window = new CreateContentFrame(inspectionid,jt_inspectionContent);
					window.jaDialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void modifyContent(final JTable jt_inspectionContent){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//传入一个检验批ID作为显示的内容的依据
					ModifyContentFrame window = new ModifyContentFrame( jt_inspectionContent);
					window.jaDialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 创建项目启动窗口
	 */
	public static void creatProject(final JTable jt) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateProjectFrame createP = new CreateProjectFrame(jt);
					createP.dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 创建检验批窗口
	 */
	public static void creatInspection() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreatInspectionFrame cif = new CreatInspectionFrame();
					cif.dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * 创建检验批窗口
	 */
	public static void creatInspection(final QuoteProject quoteProject,
			final JPanel jp_inspection) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreatInspectionFrame cif = new CreatInspectionFrame(
							quoteProject, jp_inspection);
					cif.dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 创建检验批窗口
	 */
	public static void creatInspection(final JTable jt, final JTable jt2) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreatInspectionFrame cif = new CreatInspectionFrame(jt, jt2);
					cif.dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public static void updateContent(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateContentFrame window = new CreateContentFrame();
					window.jaDialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
