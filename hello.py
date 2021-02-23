#coding=utf-8

# version python3.8
import re
import os
import sys

rst = re.findall(r'a(\d+)bc(\d+)de(\d+)f', 'a123bc456de1290f')
for x in range(rst):
	pass
print(rst)
print(rst[0][0])
print("hello python.")