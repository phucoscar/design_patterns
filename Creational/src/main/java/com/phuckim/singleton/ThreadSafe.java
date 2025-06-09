package com.phuckim.singleton;
/*
* Dùng khi có nhiều thread, nhiều luồng gọi đến singleton này
*
* volatile: Khi truy xuất biến khai báo với volatile thì mọi thread đều thấy giá trị mới nhất của biến đó trong bộ nhớ chính (main memory),
* thay vì giữ bản sao của biến trong bộ nhớ đệm riêng (thread-local cache).
*
* */
public class ThreadSafe {
    private static volatile ThreadSafe instance;

    private ThreadSafe() {}

    private static synchronized ThreadSafe getInstance() {
        if (instance == null) {
            instance = new ThreadSafe();
        }

        return instance;
    }
}
