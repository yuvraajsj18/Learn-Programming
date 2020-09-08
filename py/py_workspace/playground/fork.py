import os

child_pid = os.fork()
if not child_pid:
    print("Hello, from child")
else:
    print("Hello, from parent")
