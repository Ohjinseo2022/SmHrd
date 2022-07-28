#!/usr/bin/env python
# coding: utf-8

# In[ ]:


def add(a,b):
    return a+b


def substract(x, y,reverse = False):
    if reverse == False:
        result = x - y
    else:
        result = y - x
    return result
