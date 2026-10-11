.class public final synthetic Lax/i2/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lax/i2/g;


# direct methods
.method public synthetic constructor <init>(Lax/i2/g;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/i2/H;->q:Lax/i2/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/i2/H;->q:Lax/i2/g;

    invoke-virtual {v0}, Lax/i2/g;->f()V

    return-void
.end method
