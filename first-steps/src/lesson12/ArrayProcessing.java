package lesson12;

public class ArrayProcessing {


    public void fillWithOnes(float[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.0f;

        }
    }


    public void linearProcessing(float[] array){

        for (int i = 0; i < array.length; i++) {
            array[i] = (float)(array[i]
                    * Math.sin(0.2f + i / 5)
                    * Math.cos(0.2f + i / 5)
                    * Math.cos(0.4f + i / 2));

        }

    }

    public void parallelProcessing(float[] array){

        int arrHalfSize = array.length / 2;

        float[] arr1 = new float[arrHalfSize];
        float[] arr2 = new float[arrHalfSize];




        //System.arraycopy(массив-источник, откуда начинаем брать данные из массива-источника,
        //                  массив-назначение, откуда начинаем записывать данные в массив-назначение,
        //                  сколько ячеек копируем)

//        linearProcessing(arr1);
//        linearProcessing(arr2);

        Thread t1 = new Thread(() -> {
            System.arraycopy(array, 0, arr1, 0, arrHalfSize);
            linearProcessing(arr1);
            System.arraycopy(arr1, 0, array, 0, arrHalfSize);
//            System.out.println("T1 is finished");
        });

        Thread t2 = new Thread(() -> {
            System.arraycopy(array, arrHalfSize, arr2, 0, arrHalfSize);
            linearProcessing(arr2);
            System.arraycopy(arr2, 0, array, arrHalfSize, arrHalfSize);
//            System.out.println("T2 is finished");
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




    }

}
