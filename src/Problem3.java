public class Problem3 {
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        
        int left = 1;
        int right = x;
        int ans = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Запись "mid <= x / mid" вместо "mid * mid <= x" предотвращает переполнение типа int
            if (mid <= x / mid) {
                ans = mid; // Запоминаем возможный ответ
                left = mid + 1; // Пытаемся найти большее число
            } else {
                right = mid - 1; // Число слишком большое
            }
        }
        return ans;
    }
}
