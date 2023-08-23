# Корпус

![В оболочке логики](item:tis3d:casing)

Блок корпуса вмещает до шести (6) модулей, по одному на каждой из его сторон. Поскольку корпус должен быть подключён к [контроллеру](controller.md) для функционирования, обычно используется только до пяти (5) сторон на модуль; стороны между корпусами или между корпусом и [контроллером](controller.md) необходимы для внутренней связи и не могут содержать модули. Если модуль находится на стороне, перед которой размещается другой корпус или [контроллер](controller.md), модуль автоматически извлекается из своего корпуса.

Корпуса обеспечивают четыре порта для каждого установленного модуля, которые могут использоваться для передачи данных через край блока корпуса. Если за краем имеется другой блок корпуса, данные будут переданы через соединительную поверхность и в соседний порт соседнего блока корпуса. В противном случае порт будет соединяться с модулем на следующей стороне этого корпуса.

Это означает, что всегда есть слот для модуля за портом. Однако, если в таком слоте не установлен модуль, чтение с порта, ведущего к нему, не будет успешным, как и запись в него.

Корпуса можно заблокировать с помощью [ключа](../item/key.md). После блокировки модули больше не могут быть добавлены или удалены. Полезно для предотвращения манипуляций другими людьми или просто для предотвращения случайного удаления модулей.

Кроме того, во время приседания [ключи](../item/key.md) можно использовать для закрытия/открытия приёмных портов на сторонах каждого корпуса. Закрытие приёмного порта на стороне корпуса приведёт к остановке операций записи на этот порт из соседнего модуля и предотвратит всенаправленную запись для вывода на порт. Это позволяет создавать более компактные сборки и может сэкономить несколько [модулей выполнения](../item/execution_module.md), необходимых для направления соединения (например, только для пересылки полученных данных из [инфракрасного модуля](../item/infrared_module.md) в [модуль красного камня](../item/redstone_module.md)).