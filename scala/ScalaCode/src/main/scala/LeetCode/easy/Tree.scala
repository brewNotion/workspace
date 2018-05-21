package LeetCode.easy

object Tree extends App{

  def findSecondMinimumValue(root: TreeNode): Int = {

    val MAX_INT = Int.MaxValue
    if (root == null) return -1
    if (root.left == null && root.right == null) return -1


    def getNextDiffElement(node: TreeNode): Int = {

      if (node == null) return Int.MaxValue;
      else if (node.value != root.value) return node.value

      val left = getNextDiffElement(node.left)
      val right = getNextDiffElement(node.right)

      return (left, right) match {
        case (`MAX_INT`, r) => r
        case (l, `MAX_INT`) => l
        case (l, r) => if (l < r) l else r
      }
    }
    getNextDiffElement(root)
  }



  def trimBST(root: TreeNode, L: Int, R: Int): TreeNode = {


    def trim(node:TreeNode):TreeNode = {

      return node match {
        case null => null
        case node if(node.value<L) => trim(node.right)
        case node if(node.value>R) => trim(node.left)
        case node if(node.value>=L && node.value<=R) => {
          root.left = trim(root.left)
          root.right = trim(root.right)
          root
        }
      }
    }
    trim(root)
  }
}
