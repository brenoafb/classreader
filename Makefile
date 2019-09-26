CC=gcc
CFLAGS=-Wall -Wextra -I.
DEPS = types.h utils.h constant_info.h classfile.h attributes.h
OBJ = utils.o constant_info.o classfile.o
MAINSRC = main.c

%.o: %.c $(DEPS)
	$(CC) -c -o $@ $< $(CFLAGS)

main.out: $(OBJ)
	$(CC) -o $@ $^ $(MAINSRC) $(CFLAGS)

.PHONY: clean

clean:
	rm -f *.out *.o
