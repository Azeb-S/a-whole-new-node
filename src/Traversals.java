import java.util.ArrayList;

public class Traversals {
  public static void main(String[] args) {
    Node<Integer> root = new Node<>(88);

    Node<Integer> child1 = new Node<>(17);
    Node<Integer> child2 = new Node<>(58);
    Node<Integer> child3 = new Node<>(33);

    // root.children = new ArrayList<>();
    root.children.add(child1);
    root.children.add(child2);
    root.children.add(child3);

    Node<Integer> child1_1 = new Node<>(5);
    Node<Integer> child1_2 = new Node<>(99);
    // child1.children = new ArrayList<>();
    child1.children.add(child1_1);
    child1.children.add(child1_2);

    Node<Integer> child2_1 = new Node<>(73);
    // child2.children = new ArrayList<>();
    child2.children.add(child2_1);

    Node<Integer> child3_1 = new Node<>(24);
    Node<Integer> child3_2 = new Node<>(61);
    Node<Integer> child3_3 = new Node<>(12);
    // child3.children = new ArrayList<>();
    child3.children.add(child3_1);
    child3.children.add(child3_2);
    child3.children.add(child3_3);

    Node<Integer> child3_1_1 = new Node<>(83);
    Node<Integer> child3_1_2 = new Node<>(6);
    // child3_1.children = new ArrayList<>();
    child3_1.children.add(child3_1_1);
    child3_1.children.add(child3_1_2);

    // preorder(root);
    System.out.println(max(root));
  }

  static void preorder(Node<?> node) {

    // if null; return
    if (node == null)
      return;
    // print node value
    System.out.println(node.value);
    // if (node.children == null) {
    // return;
    // }
    // for each child
    for (Node<?> child : node.children) {
      // preorder(child)
      preorder(child);
    }

  }

  // return the max vlaue
  // if node is null return integer, MIN VALUE

  static int max(Node<Integer> node) {
    // if node is null return integer, MIN VALUE
    if (node == null)
      return Integer.MIN_VALUE;
    // biggest = node.value
    int biggest = node.value;
    // for each sub tree in node.children
    for (Node<Integer> subTree : node.children) {
      int subtreeBiggest = max(subTree);
      // if max(subtree) > biggest
      if (subtreeBiggest > biggest) {

        // bigest = subtree
        biggest = subtreeBiggest;
      }
    }
    // return biggest
    return biggest;

  }

}
