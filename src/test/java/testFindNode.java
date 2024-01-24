import java.util.Arrays;
import java.util.List;
import org.example.findNodeInBinarySearchTree;
import org.example.treeNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class testFindNode {
    treeNode node2 = new treeNode(2);
    treeNode node3 = new treeNode(2);
    treeNode root = new treeNode(1, node2, node3);

    @Test
    public void FindMode() {
        findNodeInBinarySearchTree FindNodeInBinarySearchTree = new findNodeInBinarySearchTree();

        List<Integer> actualResult = FindNodeInBinarySearchTree.findNode(root);
        List<Integer> expected = Arrays.asList(2);

        Assertions.assertEquals(expected, actualResult);

    }

}
