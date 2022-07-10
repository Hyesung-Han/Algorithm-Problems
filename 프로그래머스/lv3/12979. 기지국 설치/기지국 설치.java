class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;

        //station[i] - w까지 다 체크임
        int start = 1;
        for(int i = 0; i < stations.length; i++){
            int front = stations[i] - w;
            if(front > start){
                int count = front - start;
                answer += count/((2*w)+1);
                if(count%((2*w)+1) != 0)
                    answer += 1;
            }
                start = stations[i] + w + 1;

            if(i == stations.length-1){                
                int last = stations[i] + w;
                int count = n-last;
                if(count > 0 ){
                    answer += count/((2*w)+1);
                    if(count % ((2*w)+1) != 0)
                        answer += 1;
                }
            }
            
        }
        
        return answer;
    }
}
//stations 오름차순 배열
//첫번째 요소에 대해서 체크 
//앞만 체크
//맨 마지막은 뒤 체크할때 그냥 N으로 쳐서 계산
//끝나는 곳에서도 체크 -> station 있으면 다음 요소 체크
//없으면 그냥 바로 answer return