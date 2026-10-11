.class public final synthetic Lax/o1/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lax/o1/S$a;


# direct methods
.method public synthetic constructor <init>(Lax/o1/S$a;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/o1/t;->q:Lax/o1/S$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/o1/t;->q:Lax/o1/S$a;

    invoke-interface {v0}, Lax/o1/S$a;->f()V

    return-void
.end method
