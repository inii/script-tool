#coding=utf-8

# version python3.8
import re
import os
import sys
# print("测试汉字")
# print(sys.getdefaultencoding())

print("hello type2lua.py", os.getcwd())
in_path = r'C:/Users/Administrator/Desktop/11/ResourceType.java'
out_path = r'C:/Users/Administrator/Desktop/11/out_file.lua'

def get_lines():
	file = open(in_path, 'r', encoding='UTF-8')
	lines = None
	try:
		lines = file.readlines()
	except:
		print("readlines except path:")  

	file.close()
	return lines



out_file = open(out_path, "w+", encoding='UTF-8')
# /** 仙玉/元宝 */
# GOLD(1, "gold", "item_1"),
def translation(line_str):
	rst = re.findall(r'^\s*\/\*\*(.*)\*\/\s*', line_str)
	if rst:
		print(rst)
		for s in (rst):
			print("ssss ", s)
			out_file.write("\t--" + s + "\n")
	else:
		# print("没有找到," + line_str)
		pass

	rst = re.findall(r'^\s*([A-Z_0-9]+)\(([0-9]+),.*', line_str)
	if rst:
		print(rst[0])
		for s in (rst):
			out_file.write('\tResourceType["' + s[0] + '"]' + ' = ' + s[1] + '\n\n')


	

def handle_lines():
	line_list = get_lines()
	for line in line_list or []:
		translation(line)
	out_file.close()

# if line.find(r'[\u4e00-\u9fa5]') < 0:

if __name__ == '__main__':
	handle_lines()
	# main()