package process6.ex2;

import java.util.HashMap;

public class EnergyDistributor {
    int totalenergy;
    HashMap<String, Integer> operating = new HashMap<>();
    // 생성자에서 미리 세팅
    public EnergyDistributor() {
        operating.put("테라노바", 0);
        operating.put("루미나베이", 0);
        operating.put("플로우브릿지", 0);
        totalenergy=50000;
    }
    public void search(){
        System.out.printf("-> 전체 남은 에너지: %d\n",totalenergy);
    }
    @FunctionalInterface
    interface EnergyAllocator {
        void allocate(String name, int amount);
    }
    public EnergyAllocator allocation(){
        EnergyAllocator allocator = (name, amount) -> {
            if (amount > totalenergy) {
                System.out.println("→ 할당 가능한 에너지를 초과했습니다.");
                return;
            }

            totalenergy -= amount;
            operating.put(name, operating.getOrDefault(name, 0) + amount);
            System.out.printf("→ %s에 %d의 에너지가 할당되었습니다. 남은 전체 에너지: %d\n",name,amount,totalenergy);
        };
        return allocator;
    }
    public void find(){
        System.out.println("→ 구역별 에너지 조회");
        for (String region : operating.keySet()) {
            System.out.println(region + " - " + operating.get(region));
        }
    }
//    public void allocation(String name, int amount){
//        totalenergy-=amount;
//        operating.put(name,totalenergy);
//    }

}
