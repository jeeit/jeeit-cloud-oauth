

package com.jeeit.oauth.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 傅枫
 * @date 2017年11月9日23:33:45
 */
@Data
public class TreeNode {
	protected int id;
	protected int parentId;
	protected List<TreeNode> children = new ArrayList<TreeNode>();

	public void add(TreeNode node) {
		children.add(node);
	}
}
