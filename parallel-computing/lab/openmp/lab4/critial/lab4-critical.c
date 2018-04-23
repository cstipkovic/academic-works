#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <omp.h>

int main(int argc, char *argv[])
{
  size_t i;
  size_t sum = 0;

  double base = 2.0f;
  double expo = 30.0f;
  double vectorSize = pow(base, expo);

  // set number of threads
  int const nThread = atof(argv[1]);

  // Vectors
  size_t *vector = (size_t *) malloc(vectorSize * sizeof(size_t));

  // Fill Vector
  for (i = 0; i < vectorSize; i++)
  {
    vector[i] = 1;
  }

  // Block size per Thread
  size_t vectorSizePerThread = vectorSize / nThread;

  #pragma omp parallel num_threads(nThread)
  {
    size_t threadNumber = omp_get_thread_num();
    size_t loopStart = threadNumber * vectorSizePerThread;

    #pragma omp parallel for
    for (i = loopStart; i < (loopStart + vectorSizePerThread); i++)
    {
      // printf("i: %zu, start: %zu, thread: %zu\n", i, loopStart, threadNumber);
      #pragma omp critical
      {
        sum += vector[i];
      }
      // printf("i: %zu, threadNumber: %zu, vectorAux: %zu\n", i, threadNumber, vectorAux[threadNumber]);
    }
  }

  printf("\nCom %d threads, sum = %zu\n", nThread, sum);

  return 0;
}
