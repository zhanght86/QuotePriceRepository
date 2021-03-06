package com.zhongda.quote.utils;

import java.awt.EventQueue;
import java.util.Map;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.zhongda.quote.model.Address;
import com.zhongda.quote.model.Industry;
import com.zhongda.quote.view.AboutFrame;
import com.zhongda.quote.view.CreateBatchFrame;
import com.zhongda.quote.view.CreateContentFrame;
import com.zhongda.quote.view.CreateProjectFrame;
import com.zhongda.quote.view.CreateTaskFrame;
import com.zhongda.quote.view.DetailsOfContentFrame;
import com.zhongda.quote.view.ModifyBatchFrame;
import com.zhongda.quote.view.ModifyContentFrame;
import com.zhongda.quote.view.ModifyProjectFrame;

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
	 * 创建任务窗口或修改任务窗口
	 * @param jt_quoteTask
	 * @param isCreate 为true时，表示是创建任务窗口，false 时表示是修改任务窗口
	 */
	public static void creatTask(final JTable jt_quoteTask, final JTable jt_quoteProject, final JTable jt_inspectionBatch, final JTable jt_inspectionContent,
			final boolean isCreate) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateTaskFrame window = new CreateTaskFrame(jt_quoteTask, jt_quoteProject, jt_inspectionBatch, jt_inspectionContent,
							isCreate);
					window.jDialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 创建报价项目窗口
	 * @param jt_quoteTask
	 * @param jt_quoteProject
	 * @param jt_inspectionBatch
	 * @param jt_inspectionContent
	 */
	public static void createProject(final JTable jt_quoteTask, final JTable jt_quoteProject, final JTable jt_inspectionBatch, final JTable jt_inspectionContent) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateProjectFrame window = new CreateProjectFrame(jt_quoteTask, jt_quoteProject, jt_inspectionBatch, jt_inspectionContent);
					window.dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 修改报价项目窗口
	 * @param jt_quoteTask
	 * @param jt_quoteProject
	 */
	public static void modifyProject(JTable jt_quoteTask, JTable jt_quoteProject) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifyProjectFrame window = new ModifyProjectFrame(jt_quoteTask, jt_quoteProject);
					window.dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	  * 联动创建检验批窗口
	 * @param batchMap 需传入一个map对象接受用户选择好的检验批和检验内容
	 * @param jp_inspectionBatch 添加检验批的panel
	 * @param projectName 项目名称
	 * @param address 所选行业
	 * @param industry 所选地址
	 */
	public static void createBatch(final Map<String, Map<String,Object>> batchMap, final JPanel jp_inspectionBatch,
			final String projectName, final JTextField jtf_projectAmount, final Industry industry, final Address address) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateBatchFrame window = new CreateBatchFrame(
							batchMap, jp_inspectionBatch, projectName, jtf_projectAmount, industry, address);
					window.dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 单独创建检验批窗口
	 * @param jt_quoteProject
	 * @param jt_inspectionBatch
	 */
	public static void createBatch(final JTable jt_quoteTask, final JTable jt_quoteProject, final JTable jt_inspectionBatch, final JTable jt_inspectionContent) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateBatchFrame window = new CreateBatchFrame(jt_quoteTask,
							jt_quoteProject, jt_inspectionBatch, jt_inspectionContent);
					window.dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 修改检验批窗口
	 * @param jt_quoteProject
	 * @param jt_inspectionBatch
	 */
	public static void modifyBatch(JTable jt_quoteProject, JTable jt_inspectionBatch) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifyBatchFrame window = new ModifyBatchFrame(jt_quoteProject, jt_inspectionBatch);
					window.dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 创建检验内容窗口
	 * @param jt_quoteTask
	 * @param jt_quoteProject
	 * @param jt_inspectionBatch
	 * @param jt_inspectionContent
	 */
	public static void createContent(final JTable jt_quoteTask, final JTable jt_quoteProject, final JTable jt_inspectionBatch, final JTable jt_inspectionContent){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateContentFrame window = new CreateContentFrame(jt_quoteTask, jt_quoteProject, jt_inspectionBatch, jt_inspectionContent);
					window.jaDialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 修改检验内容窗口
	 * @param jt_quoteTask
	 * @param jt_quoteProject
	 * @param jt_inspectionBatch
	 * @param jt_inspectionContent
	 */
	public static void modifyContent(final JTable jt_quoteTask, final JTable jt_quoteProject, final JTable jt_inspectionBatch, final JTable jt_inspectionContent){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//传入一个检验批ID作为显示的内容的依据
					ModifyContentFrame window = new ModifyContentFrame(jt_quoteTask, jt_quoteProject, jt_inspectionBatch, jt_inspectionContent);
					window.jaDialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*
	 * 查看详细检验内容界面
	 */
	public static void selectContent(final Integer InspectionContentID){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DetailsOfContentFrame window = new DetailsOfContentFrame(InspectionContentID);
					window.jDialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 启动关于界面
	 */
	public static void about(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutFrame window = new AboutFrame();
					window.jaDialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
