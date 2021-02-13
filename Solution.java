class Solution {
	public static void main(String[] args) {
		SearchBST solution = new SearchBST();
		TreeNode head = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7));

		TreeNode out = solution.searchBST(head, 2);

		System.out.printf("%d, %d, %d\n", out.val, out.left.val, out.right.val);
	}
}

class SearchBST {
	public TreeNode searchBST(TreeNode root, int val) {
		if (root == null) {
			return root;
		}

		if (root.val == val) {
			return root;
		} else {
			if (val > root.val) {
				return searchBST(root.right, val);
			} else {
				return searchBST(root.left, val);
			}
		}
	}
}

class SwapNode {
	public ListNode swapPairs(ListNode head) {
		// base case
		if (head == null) {
			return head;
		} else if (head.next == null) {
			return head;
		}

		ListNode nextNext = head.next.next;
		head.next.next = head;
		ListNode newHead = head.next;
		head.next = nextNext;

		newHead.next.next = swapPairs(newHead.next.next);

		return newHead;
	}
}

class ListNode {
	int val;
	ListNode next;
	ListNode() {}
 	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }

	public void printList() {
		ListNode curr = this;
		while (curr != null) {
			System.out.println(curr.val);
			curr = curr.next;
		}
	}
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
	TreeNode() {}
	TreeNode(int val) { this.val = val; }
	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

class ReverseString {
	// Recursively reverse string
	public void reverseString(char[] s) {
		helper(s, 0, s.length - 1);
	}

	public void helper(char[] s, int left_pointer, int right_pointer) {
		// Base case
		if (left_pointer >= right_pointer) {
			return;
		}

		// Swap left and right pointers
		char temp = s[left_pointer];
		s[left_pointer] = s[right_pointer];
		s[right_pointer] = temp;

		// Recurse
		helper(s, ++left_pointer, --right_pointer);
	}
}

