package composite.template;

public class Example {
    public static void main(String[] args) {
        // Single Component
        Leaf leaf = new Leaf();
        System.out.println("Single Component:");
        System.out.println(leaf.operation());
        System.out.println();

        // Tree with composite components
        Composite tree = new Composite();

        Composite branch1 = new Composite();
        branch1.add(new Leaf());
        branch1.add(new Leaf());

        Composite branch2 = new Composite();
        branch2.add(new Leaf());
        branch2.add(new Leaf());

        tree.add(branch1);
        tree.add(branch2);

        System.out.println("Tree with composite Components:");
        System.out.println(tree + " " + leaf.operation());
    }
}
