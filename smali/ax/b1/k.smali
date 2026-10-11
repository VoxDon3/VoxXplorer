.class public final synthetic Lax/b1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lax/b1/g;


# direct methods
.method public synthetic constructor <init>(Lax/b1/g;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/b1/k;->q:Lax/b1/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/b1/k;->q:Lax/b1/g;

    invoke-static {v0}, Lax/b1/h$h;->c(Lax/b1/g;)V

    return-void
.end method
