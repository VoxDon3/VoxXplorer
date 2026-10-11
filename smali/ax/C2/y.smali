.class public final synthetic Lax/C2/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/o2/h$c;


# instance fields
.field public final synthetic a:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/C2/y;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a(Lax/o2/h$b;)Lax/o2/h;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/C2/y;->a:Landroid/content/Context;

    invoke-static {v0, p1}, Landroidx/work/impl/WorkDatabase$a;->a(Landroid/content/Context;Lax/o2/h$b;)Lax/o2/h;

    move-result-object p1

    return-object p1
.end method
