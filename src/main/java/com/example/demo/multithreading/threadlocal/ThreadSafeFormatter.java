package com.example.demo.multithreading.threadlocal;


import java.text.SimpleDateFormat;

public class ThreadSafeFormatter {

    public static ThreadLocal<SimpleDateFormat> dateFormatThreadLocal1 = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));

    public static ThreadLocal<SimpleDateFormat> dateFormatThreadLocal = new ThreadLocal<>(){

        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }

        @Override
        public SimpleDateFormat get() {
            return super.get();
        }

        @Override
        public void set(SimpleDateFormat value) {
            super.set(value);
        }

        @Override
        public void remove() {
            super.remove();
        }
    };
}
