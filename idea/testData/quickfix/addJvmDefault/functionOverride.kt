// "Add '@JvmDefault' annotation" "true"
// ERROR: '@JvmDefault' is only supported since JVM target 1.8. Recompile with '-jvm-target 1.8'
// ERROR: '@JvmDefault' is only supported since JVM target 1.8. Recompile with '-jvm-target 1.8'

// WITH_RUNTIME
interface Foo {
    @JvmDefault
    fun foo() {

    }
}
interface Bar: Foo {

    <caret>override fun foo() {

    }
}
