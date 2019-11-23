package com.java1234.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JDesktopPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrm extends JFrame {

	private JPanel contentPane;
	private JDesktopPane table=null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrm frame = new MainFrm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrm() {
		setTitle("\u56FE\u4E66\u7BA1\u7406\u7CFB\u7EDF\u4E3B\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("\u57FA\u672C\u6570\u636E\u7EF4\u62A4");
		menuBar.add(menu);
		
		JMenu mnNewMenu = new JMenu("\u56FE\u4E66\u7C7B\u522B\u7BA1\u7406");
		menu.add(mnNewMenu);
		
		JMenuItem menuItem_1 = new JMenuItem("\u56FE\u4E66\u7C7B\u522B\u6DFB\u52A0");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookTypeAddInterFrm bookTypeAddInterFrm=new BookTypeAddInterFrm();
				bookTypeAddInterFrm.setVisible(true);
				table.add(bookTypeAddInterFrm);
			}
		});
		mnNewMenu.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("\u56FE\u4E66\u7C7B\u522B\u7EF4\u62A4");
		menuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BookTypeManagerInterFrm bookTypeAddInterFrm=new BookTypeManagerInterFrm();
				bookTypeAddInterFrm.setVisible(true);
				table.add(bookTypeAddInterFrm);
			}
		});
		mnNewMenu.add(menuItem_2);
		
		JMenu menu_2 = new JMenu("\u56FE\u4E66\u7BA1\u7406");
		menu.add(menu_2);
		
		JMenuItem menuItem_3 = new JMenuItem("\u56FE\u4E66\u6DFB\u52A0");
		menuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookAddInterFrm bookTypeAddInterFrm=new BookAddInterFrm();
				bookTypeAddInterFrm.setVisible(true);
				table.add(bookTypeAddInterFrm);
			}
		});
		menu_2.add(menuItem_3);
		
		JMenuItem menuItem_4 = new JMenuItem("\u56FE\u4E66\u7EF4\u62A4");
		menuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BookManagerInterFrm bookTypeAddInterFrm=new BookManagerInterFrm();
				bookTypeAddInterFrm.setVisible(true);
				table.add(bookTypeAddInterFrm);
			}
		});
		menu_2.add(menuItem_4);
		
		JMenuItem menuItem_5 = new JMenuItem("\u5B89\u5168\u9000\u51FA");
		menuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result=JOptionPane.showConfirmDialog(null, "是否退出系统");
				if(result==0) {
					dispose();
				}
				
			}
		});
		menu.add(menuItem_5);
		
		JMenu menu_1 = new JMenu("\u5173\u4E8E\u6211\u4EEC");
		menuBar.add(menu_1);
		
		JMenuItem menuItem = new JMenuItem("\u5173\u4E8E\u672C\u7CFB\u7EDF");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				interFrm newInterFrm=new interFrm();
				newInterFrm.setVisible(true);
				table.add(newInterFrm);
			}
		});
		menu_1.add(menuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		table = new JDesktopPane();
		table.setBackground(Color.ORANGE);
		contentPane.add(table, BorderLayout.CENTER);
		
		//设置JFrame最大化
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

}
