package com.martinez;

public interface Resizable {
    void resize(int size);
    void resize(int x, int y);
    void resizeTo(UIWidget widget);
}