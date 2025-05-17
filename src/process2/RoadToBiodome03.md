# 시간복잡도 
입력값과 연산 수행 시간의 상관관계를 나타내는 척도
알고리즘의 성능을 설명하는 것이다. 프로세스가 수행해야하는 연산을 수치화한 것
실제 전체 실행시간보다 명령문의 실행시간을 계산하여 나타냄 

## 표기법
best case -> Big-Ω
average case -> Big-θ
worst case -> Big-O

## 필요성
시간복잡도 필요성 : 다양한 풀이법중에 어느 것이 더 효율적인지 판별하기 위해서 필요하다.

문제 1: O(n²)
    finding 메서드에서 바깥 for문 0~finput.length-1동안 반복 -> n (=finput.length)
                     안쪽 for문 i+1~finput.length동안 반복
    총 반복 횟수 : (n-1)+(n-2)+(n-3)+···+1 -> O(n²)

문제 2: O(n²)
    main 함수 내에서 첫번째 for문 0~A.length-1동안 반복 -> n (=A.length)
    두번째 이중for문에서 A.length*A[i].length()만큼 반복 ->  O(n²)
    세번째 check == true -> for문 0~A.length-1동안 반복 -> n
                    false -> while문
    시간복잡도 => O(n²)