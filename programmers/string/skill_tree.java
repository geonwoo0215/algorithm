package string;

public class skill_tree {

    public int solution(String skill, String[] skill_trees) {

        int answer = 0;

        for (String skill_tree : skill_trees) {
            String temp = skill_tree;

            for (int i = 0; i < skill_tree.length(); i++) {
                String s = String.valueOf(skill_tree.charAt(i));
                if (!skill.contains(s)) {
                    temp = temp.replace(s, "");
                }
            }

            String skillTemp = skill.substring(0, temp.length());

            if (skillTemp.equals(temp)) {
                answer++;
            }

        }
        return answer;
    }

}
