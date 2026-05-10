class Solution {
    public int calPoints(String[] operations) {
        List<Integer> record = new ArrayList<>();
        for (String op : operations) {
            if (op.equals("+")) {
                int n = record.size();
                record.add(record.get(n - 1) + record.get(n - 2));

            } else if (op.equals("D")) {
                record.add(record.get(record.size() - 1) * 2);

            } else if (op.equals("C")) {
                record.remove(record.size() - 1);

            } else {
                record.add(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for (int score : record) {
            sum += score;
        }
        return sum;
    }
}