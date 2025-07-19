import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Huffmancode {
    private HashMap<Character, String> encoder;
    private HashMap<String, Character> decoder;

    private class Node implements Comparable<Node> {
        Character data;
        int cost; // frequency
        Node left;
        Node right;

        public Node(Character data, int cost) {
            this.data = data;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node other) {
            if (this.cost != other.cost) {
                return this.cost - other.cost;
            } else if (this.data != null && other.data != null) {
                return this.data - other.data;
            } else if (this.data != null) {
                return -1;
            } else if (other.data != null) {
                return 1;
            } else {
                return 0;
            }
        }
    }
    public Huffmancode(String feeder) {
        // Frequency map
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < feeder.length(); i++) {
            char ch = feeder.charAt(i);
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Min-heap
        PriorityQueue<Node> heap = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            heap.add(new Node(entry.getKey(), entry.getValue()));
        }

        // Build Huffman tree
        while (heap.size() > 1) {
            Node n1 = heap.poll();
            Node n2 = heap.poll();
            Node merged = new Node(null, n1.cost + n2.cost);
            merged.left = n1;
            merged.right = n2;
            heap.add(merged);
        }

        Node root = heap.poll();

        encoder = new HashMap<>();
        decoder = new HashMap<>();
        buildCodes(root, "");
    }

    private void buildCodes(Node node, String path) {
        if (node == null) return;

        if (node.left == null && node.right == null) {
            encoder.put(node.data, path);
            decoder.put(path, node.data);
            return;
        }

        buildCodes(node.left, path + "0");
        buildCodes(node.right, path + "1");
    }

    public String encode(String input) {
        StringBuilder sb = new StringBuilder();
        for (char ch : input.toCharArray()) {
            sb.append(encoder.get(ch));
        }
        return sb.toString();
    }

    public String decode(String encodedStr) {
        StringBuilder key = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < encodedStr.length(); i++) {
            key.append(encodedStr.charAt(i));
            if (decoder.containsKey(key.toString())) {
                result.append(decoder.get(key.toString()));
                key.setLength(0);
            }
        }
        return result.toString();
    }

    public void printHuffmanCodes() {
        System.out.println("Huffman Codes:");
        for (Map.Entry<Character, String> entry : encoder.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }
}
 class Main {
    public static void main(String[] args) {
        String input = "abbccda";

        Huffmancode hf = new Huffmancode(input);

        // 1. Print codes
        hf.printHuffmanCodes();

        // 2. Encode
        String encoded = hf.encode(input);
        System.out.println("\nEncoded String: " + encoded);
        System.out.println("Encoded Length: " + encoded.length() + " bits");

        // 3. Decode
        String decoded = hf.decode(encoded);
        System.out.println("Decoded String: " + decoded);
    }
}
// -> output shows.in online java compiler but in here it was showing only 13 but 13 correct because i copied this code in chargbt it gives correct.

// Huffman Codes:
// 'a' : 01
// 'b' : 10
// 'c' : 11
// 'd' : 00
// Encoded String: 01101011110001
// Encoded Length: 14 bits